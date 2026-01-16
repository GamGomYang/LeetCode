class Solution:
    def accountsMerge(self, accounts):
        from collections import defaultdict


        graph = defaultdict(list)
        email_to_name = {}

        for acc in accounts:
            name = acc[0]
            first_email = acc[1]

            for email in acc[1:]:
                email_to_name[email] = name

                graph[first_email].append(email)
                graph[email].append(first_email)

        visited = set()
        res = []


        def dfs(email, component):

            visited.add(email)
            component.append(email)

            for nei in graph[email]:
                if nei not in visited:
                    dfs(nei, component)


        for email in graph:
            if email not in visited:
                component = []
                dfs(email, component)


                name = email_to_name[email]
                res.append([name] + sorted(component))

        return res
